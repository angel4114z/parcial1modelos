package Punto1.observer;

public class Webmaster implements Observer{

    private String name;

    public Webmaster(String name){
        this.name = name;
    }

    @Override
    public void update(String course, int type) {
        switch (type){
            case 1:
                System.out.println(this.name + " Se encuentra un nuevo curso disponible! es: " + course + " ahora puedes crear su sitio en la web de la universidad");
                break;
            case 2:
                System.out.println(this.name + " Se ha eliminado el curso: " + course + " ahora puedes eliminar su sitio en la web de la universidad");
                break;
            case 3:
                System.out.println(this.name + " Se ha actualizado el curso : " + course + " ahora puedes actualizar su sitio en la web de la universidad");
                break;
            default:
                break;
        }}
    
}
