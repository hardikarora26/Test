package com.test;

import org.apache.commons.lang3.StringUtils;

public enum TestMode {
        DEFAULT("default"), ADAPTIVE("adaptive");

        private String modeName;

        TestMode(String modeName) {
            this.modeName = modeName;
        }

        public String getModeName() {
            return modeName;
        }

        public TestMode getChangeMode(String modeName) {
            if (StringUtils.isBlank(modeName)) {
                return DEFAULT;
            } else {
                try {
                    return TestMode.valueOf(modeName.trim().toUpperCase());
                } catch (IllegalArgumentException e) {
                    return DEFAULT;
                }
            }
        }

}
