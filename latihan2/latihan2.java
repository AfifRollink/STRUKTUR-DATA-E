package latihan2;
import java.util.*;

public class latihan2 {
    public static void main(String[] args) {
      ArrayList<String> Hewan = new ArrayList<>();
      ArrayList<String> DeleteHewan = new ArrayList<>();

      Hewan.add("Sapi");
      Hewan.add("Kelinci");
      Hewan.add("Kambing");
      Hewan.add("Unta");
      Hewan.add("Domba");
      System.out.println("Hewan : " + Hewan);

      System.out.println("Hewan yang di hapus :");
      DeleteHewan.add("Kelinci");
      DeleteHewan.add("Kambing");
      DeleteHewan.add("Unta");
        System.out.println(DeleteHewan);

//        DeleteHewan.addAll(Hewan);
      Hewan.remove("Kelinci");
      Hewan.remove("Kambing");
      Hewan.remove("Unta");
        System.out.println("Output Hewan :");
        System.out.println(Hewan);
    }
}

