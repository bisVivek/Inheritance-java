public class inheritanceprac {

    protected String Vehicle="BMW";

    public void honk(){
        System.out.println("peep peep");
    }

    class carss extends inheritanceprac{
        private String model="fortuner";
    }
}
