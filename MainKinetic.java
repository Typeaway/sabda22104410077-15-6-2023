package w04.encapsulation;

/**
 *
 * @author Sabda Gusti Syailendra (22104410077)
 */

public class MainKinetic {
 double massa, EnergiKinetic ;
 double kecepatan = Math.pow(2, 2) ;

    public double getMassa() {
        return massa;}

    public void setMassa(double massa) {
        this.massa = massa;}

    public double getEnergiKinetic() {
        return EnergiKinetic = 0.5 * massa * kecepatan; }

    public void setEnergiKinetic(double EnergiKinetic) {
        this.EnergiKinetic = EnergiKinetic;}

    public double getKecepatan() {
        return kecepatan;}

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;}

     public static void main (String[] args){
        MainKinetic sepeda = new MainKinetic();
        sepeda.setMassa(20);
         System.out.println("kecepatan: "+ sepeda.getKecepatan());
         System.out.println("massa: "+ sepeda.getMassa());
        System.out.println("EnergiKinetic: " + sepeda.getEnergiKinetic());
     }
}
