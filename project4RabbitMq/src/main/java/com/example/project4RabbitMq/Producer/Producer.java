package com.example.project4RabbitMq.Producer;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project4RabbitMq.Config.MessageConfig;
import com.example.project4RabbitMq.Model.Order;
import com.example.project4RabbitMq.Model.Status;

@RestController
@RequestMapping("/producer")
public class Producer {
	@Autowired
	RabbitTemplate template;

	@PostMapping("/{Restname}")
	public String bookOrder(@RequestBody Order order) {
		order.setOrderid(UUID.randomUUID().toString());
		Status status=new Status(order,"Success","order placed");
		template.convertAndSend(MessageConfig.Exchange, MessageConfig.Routing_key,status);
		return "Success";
		
	}

}
