package com.kaipulla.blockchain;

import java.util.Arrays;
import java.util.Date;

public class Client {

    public static void main(String ... args ) {
        Transaction t1 = new Transaction("tamil", "baskar", 20.0);
        Transaction t2 = new Transaction("baskar", "vijay", 50.0);
        Transaction t3 = new Transaction("baskar", "vijay", 50.0);
        System.out.println(t1.hashCode()+" "+t2.hashCode()+" "+t3.hashCode());
        Date timestamp = new Date();
        Block firstBlock = new Block(0, timestamp, 0, Arrays.asList(t1, t2));
        BlockChain chain = new BlockChain();
        chain.addToChain(firstBlock);
        timestamp = new Date();
        Block next = new Block(chain.getBlocks().size()+1, timestamp, firstBlock.hashCode(), Arrays.asList(t3));
        chain.addToChain(next);
        System.out.println(firstBlock.hashCode()+" "+next.hashCode());
        System.out.println("Length of this chain is: "+chain.getBlocks().size());
    }
}
