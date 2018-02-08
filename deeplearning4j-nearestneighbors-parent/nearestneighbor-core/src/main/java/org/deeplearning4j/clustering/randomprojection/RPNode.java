package org.deeplearning4j.clustering.randomprojection;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RPNode {
    private int depth;
    private RPNode left,right;
    private List<Integer> indices;
    private double median;


    public RPNode(int depth) {
        this.depth = depth;
        indices = new ArrayList<>();
    }
}
