package demo;

public class StrategyDemo {
	interface HowtoPay {
		void pay(int amount);
	}
	
	static class CreditCardPayment implements HowtoPay {
		@Override
		public void pay(int amount) {
			System.out.println("Card payment: $" + amount);
		}
	}
	
	static class PayPalPayment implements HowtoPay {
		@Override
		public void pay(int amount) {
			System.out.println("PayPal payment: $" + amount);
		}
	}

	static class Checkout {
		private HowtoPay strategy;

		void pay(int amount) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	public static void main(String[] args) {
		Checkout checkout = new Checkout(new CreditCardPayment());
		checkout.pay(20);
		checkout.setStrategy(new PayPalPayment());
		checkout.pay(20);
	}

}
