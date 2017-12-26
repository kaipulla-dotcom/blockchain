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

    public boolean isValid() {
        if(blocks != null && blocks.size() > 0) {
            for (int i = 1; i < blocks.size(); i++) {
                Block first = blocks.get(i);
                Block prev = blocks.get(i-1);

                if(first.getPreviousHash() != prev.hashCode()) {
                    return false;
                }
            }
        }
        return true;
    }
}
