package Ejemplo1;

public class MyService {

    private final MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public String getDataById(int id) throws Exception {
        return myRepository.findById(id);
    }
}
