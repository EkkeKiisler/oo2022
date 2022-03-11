public class Arvuti {
    Info info;
    int maksumus;

    public Arvuti(Info info, int maksumus) {
        this.info = info;
        this.maksumus = maksumus;
<<<<<<< HEAD
=======

>>>>>>> 58db31d1c2a7756407649cce231b7f9396caad0a
    }

    public String getInfo() {
        return "Arvuti on parameetritega: " + this.info + ". Maksumus on: " + this.maksumus;
    }
}
