---
title: Deeplearning4j Model Persistence
short_title: Model Persistence
description: Saving and loading of neural networks.
category: Models
weight: 10
---

## Saving and Loading a Neural Network

The `ModelSerializer` is a class which handles loading and saving models. There are two methods for saving models shown in the examples through the link. The first example saves a normal multilayer network, the second one saves a [computation graph](https://deeplearning4j.org/docs/latest/deeplearning4j-nn-computationgraph).

Here is a [basic example](https://github.com/eclipse/deeplearning4j-examples/tree/master/dl4j-examples/src/main/java/org/deeplearning4j/examples/misc/modelsaving) with code to save a computation graph using the `ModelSerializer` class, as well as an example of using ModelSerializer to save a neural net built using MultiLayer configuration.

### RNG Seed

If your model uses probabilities (i.e. DropOut/DropConnect), it may make sense to save it separately, and apply it after model is restored; i.e:

```bash
 Nd4j.getRandom().setSeed(12345);
 ModelSerializer.restoreMultiLayerNetwork(modelFile);
```

This will guarantee equal results between sessions/JVMs.

## Model serializer

{{autogenerated}}