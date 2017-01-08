/**
 * 
 */
package net.iosynth.adapter;

import java.util.UUID;

/**
 * @author rradev
 *
 */
public class MqttConfig {
    public long seed;
    protected String topic;
    protected int qos;
    protected String broker;
    protected UUID uuid;
    protected String session;

	public MqttConfig(){
    	// Global configuration
    	this.seed         = 2052703995999047696L; // magic number
    	// Adapter default configuration
    	this.topic        = "iosynth/";
    	this.qos          = 2;
    	this.broker       = "tcp://localhost:1883";
    	UUID uuid         = UUID.randomUUID();
    	this.session      = Long.toString(uuid.getMostSignificantBits(), 36);
    }

}