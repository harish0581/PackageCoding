package com.mobiquity.packer;

import com.mobiquity.exception.APIException;

public class PackerMain {
    public static void main(String[] args) throws APIException {
        if (args.length != 1){
            System.err.println("input file path must be provided as args[0], extra args is forbidden");
            System.exit(1);
        }

        System.out.println(Packer.pack(args[0]));
    }
}
