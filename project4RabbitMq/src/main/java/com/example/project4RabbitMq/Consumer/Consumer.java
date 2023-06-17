package com.example.project4RabbitMq.Consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.project4RabbitMq.Config.MessageConfig;
import com.example.project4RabbitMq.Model.Status;

@Component
public class Consumer {
	@RabbitListener(queues=MessageConfig.Queue)
	public void consumeMessageFromQueue(Status Status)
	{
		System.out.println("Message received from queue: "+Status);
	}
}
