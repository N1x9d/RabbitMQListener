package com.example.rabbitmqlistener;
import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

  private CountDownLatch latch = new CountDownLatch(1);

  public void receiveMessage(String message) {
    System.out.println("Received <" + message + ">");
    latch.countDown();
  }

  public CountDownLatch getLatch() {
    return latch;
  }

}
