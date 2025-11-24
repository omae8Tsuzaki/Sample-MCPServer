# Sample-MCPServer

- MCPサーバーの実装検証用のリポジトリ
- Spring Boot AI を使用したMCPサーバー
- 検証のため、外部につなぐAPIは利用しない
- 通信方式は stdio なので、ローカルでのみ動作

## 実行方法

1. 動作確認として、アプリケーションの実行をする。
   - この際、以下のようなエラーが発生するが、これはログ出力をしないように設定したため発生するので無視。

    ```sh
    21:40:51,283 |-ERROR in ch.qos.logback.classic.PatternLayout("") - Empty or null pattern.
    ```

2. Gradle プロジェクトの同期
3. Task > build > bootJar を実行
4. 生成されたJarファイルのパスを取得し、MCP ホストに以下のように指定。

```json
{
  "mcpServers": {
    "sample-mcp-server": {
      "command": "C:/Program Files/Java/jdk-21/bin/java.exe",
      "args": [
        "-jar",
        "user/Sample-MCPServer/build/libs/Sample-MCPServer-0.0.1-SNAPSHOT.jar"
      ]
    }
  }
}
```

## 参考

- [初めての MCP サーバーの作成 (Spring Boot を使用) - AI モデルを現実世界で動作させる](https://www.youtube.com/watch?v=ik5-ukQPtyQ&t=308s)
