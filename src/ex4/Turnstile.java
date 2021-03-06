package ex4;

import ex4.TurnstileCounter;
import ex4.TurnstileCounter;


public class Turnstile implements Runnable{
  private final TurnstileCounter counter;
  private int count;

  final int COUNT_MAX = 1000;

  Turnstile(TurnstileCounter c) {
    counter = c;
  }

  public int getCount() {
    return count;
  }

  @Override
  public void run() {
    for (int i = 0; i < COUNT_MAX; i++) {
      counter.incr();
      count++;
    }
  }
  
}
