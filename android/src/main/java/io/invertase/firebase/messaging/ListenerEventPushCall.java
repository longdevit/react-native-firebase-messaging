package io.invertase.firebase.messaging;

import com.google.firebase.messaging.RemoteMessage;
public class ListenerEventPushCall {
   private EventPushCall eventPushCall;
   private static ListenerEventPushCall listenerEventPushCall;
   public static ListenerEventPushCall getInstant() {
       if (listenerEventPushCall == null) {
           listenerEventPushCall = new ListenerEventPushCall();
       }
       return listenerEventPushCall;
   }
   public void registerEvent(EventPushCall eventPushCall) {
       this.eventPushCall = eventPushCall;
   }
   public void callEventPushCall(RemoteMessage remoteMessage) {
       if (eventPushCall != null) {
           eventPushCall.push(remoteMessage);
       }
   }
 public interface EventPushCall {
   void push(RemoteMessage remoteMessage);
 }
}
