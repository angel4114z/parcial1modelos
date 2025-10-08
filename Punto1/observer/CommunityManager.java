package Punto1.observer;

public class CommunityManager implements Observer{
    
    private String name;

    public CommunityManager(String name){
        this.name = name;
    }
    @Override
    public void update(String course, int type) {

        switch (type){
            case 1:
                System.out.println(this.name + " Se encuentra un nuevo curso disponible! es: " + course + " ahora puedes crear post en redes sociales");
                break;
            case 2:
                System.out.println(this.name + " Se ha eliminado el curso: " + course + " ahora puedes dejar de hacer posts en redes sociales");
                break;
            case 3:
                System.out.println(this.name + " Se ha actualizado el curso : " + course + " ahora puedes crear posts en redes sociales con la informacion actualizada");
                break;
            default:
                break;
        }
        
    
    
    }
    
}
