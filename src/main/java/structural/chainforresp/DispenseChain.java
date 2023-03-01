package structural.chainforresp;

public interface DispenseChain {
	void setNextChain(DispenseChain dispenseChain);
	void dispense(Currency currency);
}
