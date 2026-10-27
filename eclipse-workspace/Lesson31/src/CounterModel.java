/*
 * a model
 */
public class CounterModel {
	public int ClickCount;
	
	public int getClickCount() {
		return this.ClickCount;
	}
	
	public void increment() {
		ClickCount++;
	}
}
