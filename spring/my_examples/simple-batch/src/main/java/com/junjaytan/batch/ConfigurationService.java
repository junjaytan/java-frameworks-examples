package com.junjaytan.batch;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by junjaytan on 3/31/16.
 */

@Service
public class ConfigurationService {

    // set a default
    @Value("${type}")
    public static String type;

    // set default to 10k
    @Value("${chunkSize}")
    public static int chunkSize;

}
