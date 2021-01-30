import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Proizvod p1=new Proizvod("S20",4900);
        Proizvod p2=new Proizvod("S10",4500);
        Proizvod p3=new Proizvod("iPhone 10",5500);
        Proizvod p4=new Proizvod("iPhone 11",6500);
        Proizvod p5=new Proizvod("A70",2500);

  //      ArrayList<Proizvod> proizvodi= (ArrayList<Proizvod>) Arrays.asList(p1,p2,p3,p4,p5);
        ArrayList<Proizvod> proizvodi=new ArrayList<>();
        proizvodi.add(p1);
        proizvodi.add(p2);
        proizvodi.add(p3);
        proizvodi.add(p4);
        proizvodi.add(p5);

        //sortiranje uzlazno, silazno
        ArrayList<Proizvod> prSortirani=(ArrayList<Proizvod>) proizvodi.stream()
                .sorted(Comparator.comparing(Proizvod::getCijena))
                //.sorted(Comparator.comparing(Proizvod::getCijena).reversed())
                .collect(Collectors.toList());

        //filtriranje
        ArrayList<Proizvod> prSkupljiOd5000= (ArrayList<Proizvod>) proizvodi.stream()
                .filter(pr->pr.getCijena()>5000)
                .collect(Collectors.toList());

        //map-kreira novo polje
        List<Double> prMap=  proizvodi.stream()
                .map(pr->pr.getCijena()*2)
                .collect(Collectors.toList());

        //reduce-određene vrijednosti iz kolekcije reducira u jednu
        double prSuma=proizvodi.stream()
                .map(pr->pr.getCijena())
                .reduce(0.0,(acc,pr)->acc+pr);


        System.out.println(prSuma);


    }
}
