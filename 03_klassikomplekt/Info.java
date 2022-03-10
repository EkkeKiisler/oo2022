public class Info {
    String model;
    String processor;
    String graphics;
    int ram;
    int hdd;

    public Info(String model, String processor, String graphics, int ram, int hdd) {
        this.model = model;
        this.processor = processor;
        this.graphics = graphics;
        this.ram = ram;
        this.hdd = hdd;
    }

<<<<<<< HEAD
=======

>>>>>>> 58db31d1c2a7756407649cce231b7f9396caad0a
    @Override
    public String toString() {
        return "Info{" +
                "model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", graphics='" + graphics + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
