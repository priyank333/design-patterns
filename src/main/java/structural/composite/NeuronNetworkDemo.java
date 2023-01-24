package structural.composite;

import java.util.Collections;

public class NeuronNetworkDemo {
    public static void main(String[] args) {
        Neuron neuron1 = new Neuron();
        Neuron neuron2 = new Neuron();
        NeuronLayer layer1 = new NeuronLayer();
        NeuronLayer layer2 = new NeuronLayer();
        neuron1.connectTo(neuron2);
        layer1.connectTo(neuron1);
        neuron1.connectTo(layer1);
        layer1.connectTo(layer2);
    }
}
