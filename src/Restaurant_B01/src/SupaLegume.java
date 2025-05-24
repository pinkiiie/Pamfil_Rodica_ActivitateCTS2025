package Restaurant_B01.src;

class SupaLegume implements ISupa {
    @Override
    public void prepara() {
        System.out.println("Se prepară supă de legume cu morcovi, țelină și cartofi");
    }

    @Override
    public void serveste() {
        System.out.println("Se servește supă de legume cu pătrunjel proaspăt");
    }
}
