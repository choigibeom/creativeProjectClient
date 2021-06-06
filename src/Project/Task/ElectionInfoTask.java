package Project.Task;

import Project.Persistance.ElectionDTO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ElectionInfoTask {
    ArrayList<ElectionDTO> electionDTOList = new ArrayList<>();

    public void list () {
        try{
            Socket clSocket = new Socket("localhost", 9594);
            ObjectInputStream ois = new ObjectInputStream(clSocket.getInputStream());
            electionDTOList = (ArrayList<ElectionDTO>) ois.readObject();
            for(ElectionDTO dto : electionDTOList){
                System.out.println(dto.getSgName());
            }
        }catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}
