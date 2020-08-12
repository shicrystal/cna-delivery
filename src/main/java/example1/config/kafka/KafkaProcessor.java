package example1.config.kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface KafkaProcessor {

    String INPUT = "event-in";
    String OUTPUT = "event-out";

    @Input(INPUT)
    SubscribableChannel inboundTopic();

    @Output(OUTPUT)
    MessageChannel outboundTopic();

    /*kafka channel 2개로 나눌 때*/
//    String INPUT2 = "event-in2";
//    String OUTPUT2 = "event-out2";
//
//    @Input(INPUT2)
//    SubscribableChannel inboundTopic2();
//
//    @Output(OUTPUT2)
//    MessageChannel outboundTopic2();
}
