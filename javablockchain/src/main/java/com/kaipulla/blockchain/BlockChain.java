package com.kaipulla.blockchain;

import java.util.Arrays;

public class BlockChain {

    public static void main(String ... args) {
        Transaction t1 = new Transaction("tamil", "baskar", 20.0);
        Transaction t2 = new Transaction("baskar", "vijay", 50.0);
        Transaction t3 = new Transaction("baskar", "vijay", 50.0);
        System.out.println(t1.hashCode()+" "+t2.hashCode()+" "+t3.hashCode());
        Block firstBlock = new Block(0, Arrays.asList(t1, t2));
        Block next = new Block(firstBlock.hashCode(), Arrays.asList(t3));
        System.out.println(firstBlock.hashCode()+" "+next.hashCode());
    }

}
