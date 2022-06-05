package exercise_cafe;

import java.io.IOException;

public interface OrderService {
	public void welcome();
	public void order() throws IOException;
	public void orderCheck();
	public void pickup();
} // end Orderable