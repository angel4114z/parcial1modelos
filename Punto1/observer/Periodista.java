package Punto1.observer;

public class Periodista implements Observer{
    
    private String name;

    public Periodista(String name){
        this.name = name;
    }
    @Override
    public void update(String course, int type) {
        switch (type){
            case 1:
                System.out.println(this.name + " Se encuentra un nuevo curso disponible! es: " + course + " ahora puedes emitir spots publicitarios en la emisora de la universidad");
                break;
            case 2:
                System.out.println(this.name + " Se ha eliminado el curso: " + course + " ahora puedes dejar de emitir spots publicitarios en la emisora de la universidad");
                break;
            case 3:
                System.out.println(this.name + " Se ha actualizado el curso : " + course + " ahora puedes emitir spots publicitarios en la emisora de la universidad con la infomacion actualizada");
                break;
            default:
                break;
        }}
    
}
