class CardPayment implements PaymentStrategy {
    @Override
    public void pay(double totalPrice) {
        System.out.println("Payment of $" + totalPrice + " made with Card.");
    }
}
