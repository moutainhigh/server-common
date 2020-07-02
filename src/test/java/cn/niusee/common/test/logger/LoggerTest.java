/*
 * Niusee server-common
 *
 * Copyright 2015-2017 by Niusee.inc. All rights reserved.
 */
package cn.niusee.common.test.logger;

import cn.niusee.common.logger.LoggerHelper;
import junit.framework.TestCase;

/**
 * 测试日记
 *
 * @author Qianliang Zhang
 */
public class LoggerTest extends TestCase {

    private final LoggerHelper logger = new LoggerHelper(LoggerTest.class);

    public void testLog() {
        logger.trace("test");
        logger.debug("test");
        logger.info("test");
        logger.warn("test");
        logger.error("test");
    }
}
