package Restaurant_B01.src;

class SupaVita implements ISupa {
    @Override
    public void prepara() {
        System.out.println("Se prepară supă de vită cu carne de vită și legume");
    }

    @Override
    public void serveste() {
        System.out.println("Se servește supă de vită fierbinte cu ardei iute");
    }
}