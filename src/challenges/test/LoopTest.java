package challenges.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import challenges.com.loopinspector.LoopInspector;
import challenges.com.loopinspector.Node;

public class LoopTest {

	@Test
	public void loop_size_of_3() {
		Node list = Node.createChain(3, 3);
		int result = new LoopInspector().loopSize(list);
		assertEquals("Incorrect loop size", 3, result);
	}

	@Test
	public void loop_size_of_29() {
		Node list = Node.createChain(21, 29);
		int result = new LoopInspector().loopSize(list);
		assertEquals("Incorrect loop size", 29, result);
	}

	@Test
	public void loop_size_of_1087() {
		Node list = Node.createChain(3904, 1087);
		int result = new LoopInspector().loopSize(list);
		assertEquals("Incorrect loop size", 1087, result);
	}

}
