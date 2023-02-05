package Class10Homework2Darray;

public class vezba {
    String censorLetter( String a, char b){
        String newS=a.replace(b,'*');
return newS;
    }

    public static void main(String[] args) {
        vezba ak=new vezba();
        System.out.println(ak.censorLetter("anika",'a'));

    }
}
