package com.mcp.Sample_MCPServer;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

/**
 * <p>簡単な計算を行うサービスクラス。</p>
 */
@Service
public class CalculatorService {

    @Tool(description = "2つの整数を加算します。")
    public int add(int a, int b) {
        return a + b;
    }
}
