package com.qa.questionsTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.qa.questions.Questions;

public class QuestionsTest {
	Questions q = new Questions();
	
	@Test
	public void addTest() {
		assertEquals(50, q.add(25, 25));
	}
	
	@Test
	public void subtractTest() {
		assertEquals(24, q.subtract(50, 26));
	}
}
