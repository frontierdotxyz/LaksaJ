package com.firestack.laksaj.blockchain;


import lombok.Data;
import lombok.experimental.Builder;

@Data
@Builder
public class ShardingStructure {
    private int[] numPeers;
}