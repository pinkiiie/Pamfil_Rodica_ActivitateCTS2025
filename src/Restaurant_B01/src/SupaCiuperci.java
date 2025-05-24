package Restaurant_B01.src;

class SupaCiuperci implements ISupa {
    @Override
    public void prepara() {
        System.out.println("Se prepară supă de ciuperci cu ciuperci champignon și smântână");
    }

    @Override
    public void serveste() {
        System.out.println("Se servește supă de ciuperci cu crutoane");
    }
}
