package Project.Task;

import Project.Persistance.CandidateDTO;
import Project.Persistance.VotingDTO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;

public class CandidateInfoTask {

    ArrayList<CandidateDTO> candidateDTOList = new ArrayList<>();

    public void list (){
        try{
            Socket clSocket = new Socket("localhost", 9594);
            ObjectInputStream ois = new ObjectInputStream(clSocket.getInputStream());
            candidateDTOList = (ArrayList<CandidateDTO>) ois.readObject();
            for(CandidateDTO dto : candidateDTOList){
                System.out.println(dto.getName());
            }
        }catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}
