public class Main {

    public static void main(String[] args){

        Coche coche01 = new Coche();
        Coche coche02 = new Coche();

        CocheCRUD cocheCrud = new CocheCRUDimpl();

        cocheCrud.save(coche01);
        cocheCrud.delete(coche02);
        cocheCrud.findAll(coche02);

        // para objetos Coche todavía NO creados
        cocheCrud.save(new Coche());
        cocheCrud.delete(new Coche());
        cocheCrud.findAll(new Coche());




    }
}
