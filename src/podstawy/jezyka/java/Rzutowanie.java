package podstawy.jezyka.java;
// Konwersja i Rzutowanie typów 1.7
public class Rzutowanie {
    public static void main(String[]args){        
    int i=-1;
    double d=2.5;
    float f=3.2F;
    long l=4;
    short s=5;
    char c=54;
        System.out.println("Konwersja:");
        System.out.println("i: "+i+"    d: "+d+"    f: "+f+"    l: "+l+"    s: "+s+"    c: "+c);
    
    //int suma=i+d;
    //suma=i+f;
    //suma=i+l;
    int suma1=i+s;
    System.out.println("\nSumaINT int+short:\t"+suma1);
    
    //float suma2=d+f;
    float suma2=f+i;
    System.out.println("SumaFLOAT int+float:\t"+suma2);
    suma2=i+s;
    System.out.println("SumaFLOAT int+short:\t"+suma2);
    
    double suma3=f+s;
    System.out.println("SumaDOUBLE float+short:\t"+suma3);
    suma3=d+l;
    System.out.println("SumaDOUBLE double+long:\t"+suma3);
    
    suma3=d+c;
    System.out.println("SumaDOUBLE double+char:\t"+suma3+"\t!!!\n\n");
    
    System.out.println("Rzutowanie (konwersja jawna):");
    System.out.println("i: "+i+"    d: "+d+"    f: "+f+"    l: "+l+"    s: "+s+"    c: "+c);
        
    int suma_1= (int)d+i;
    System.out.println("\nSumaINTEGER double+int:\t\t"+suma_1);
    suma_1= (int)l+s;
    System.out.println("SumaINTEGER long+short:\t\t"+suma_1);
    suma_1= (int)d+(int)f;
    System.out.println("SumaINTEGER float+double:\t"+suma_1);
    suma_1= (int)l+(int)c;
    System.out.println("SumaINTEGER int+(int)char:\t"+suma_1);
    suma_1= (int)l+c;
    System.out.println("SumaINTEGER int+char:\t\t"+suma_1);
    
    char suma_2= 'c'+'c';
    System.out.println("\nSumaCHAR 'char'+'char':\t\t"+suma_2);
    suma_1=(int)suma_2;
    System.out.println("SumaINTEGER 'char'+'char':\t"+suma_1);
    
    }
}