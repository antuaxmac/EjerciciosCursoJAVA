public class CocheCRUDimpl implements CocheCRUD{


        @Override
    public void save(Coche coche) {
        System.out.println("Este método guarda un coche en la BBDD");

    }

    @Override
    public void findAll(Coche coche) {
        System.out.println("Este método encuentra todos los coches");
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Este método borra un coche en la BBDD");
    }
}
