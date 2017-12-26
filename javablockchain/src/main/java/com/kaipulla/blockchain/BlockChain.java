package com.kaipulla.blockchain;

import java.util.ArrayList;
import java.util.List;

public class BlockChain {

    private List<Block> blocks = new ArrayList<>();

    public List<Block> getBlocks() {
        return blocks;
    }

    public synchronized void addToChain(Block block) {
        blocks.add(block);
    }
}
