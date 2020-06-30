package com.graduation.config;

public class AlipayConfig {
    public static String APPID = "2016102200739931"; // 合作身份者ID


    //私钥pkcs8格式
    public static String RSA_PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCXR2UJcKiP7aHHDNoMTZ86JyoNkgBAzbalJculipitLH91dhl9IeqQQcYIjD9zqmZgl0iXGui6wKgQu7cxGaQvcwb8qrLoA5FtU0ZA7P1orX85iEVIsYCj+TUXBL6oPqrvtdt4t3qJd+Ys3SDk7EqkbXuED1UznlXnRXglZ7oPo598bELfoQ4DW9Zz9A1Hbd8MJcZMMqBqddy0xGgRKvwo6Cw2H/MzbfnfoyYJnG0BXem96UGIBgW4zph6jf8WdMK5Csv82tztpAUdGp4K6b0iH+D6DTBmqZjVeBXsuZ5BcwwEHfN+WCOwfVS5seifLF9T9qOSRznke+l4vcjwrjglAgMBAAECggEBAIL2q+GgRk1Ty9omph5AlLgjb6SP4Og5LwWJ0uNdOQ+yliV6OFa8JfT8/BQqVkQsILU+QvmNsiz63ISf/dfj+t+ZFVNn87ooXJ3omclbYYZdrOaBsnlcMaHC/NMQqH2+wv0C0x2OueaIhhwQ04lbhsMShPuuynQFfxjYa0r2oX0nMuiZaRLEAqR+kjOhNeiu0GEk+qwuHHAeavr5GutbNQHnQKNCUKa6Jdr435HmZJJI9NA3VSH0gl58+PcZLjLt2lDWV8KCPBHmrj3A278qGN7VMngBnfuNXVGZC8e3WOZpSKozZK2l5xlz9PG3gzwQ/aLMz86IZfDMkHdh02fraAECgYEA3CpRDk5JSWfc29s2Ie+zVAmlns6ve4HjFFPWk3F3HpxXyS32wboJOsEhMFliX1Jxejv8jx3Ph/O/xayC+7/jLtf2ffu21MUWpi2qvHriTK0/3NGFn1nEjWDh1zX/zpYtvMV1Mg3R5m+VFMml740qeZcbiW9Y8IgITNbCg9NVItECgYEAr+bFNvenqZGHG0plXcw6gIq03/DWtLoah5QGIiPcucD+Zik2YxpWZTbqO4YJ3u9CdXVO206XWyzgOYTBo9fQU6HoFUrORZOs/b38+kC70N4SCnOqQ9DHMEdv2X6LdbmzHu5lsUNtdI6cPJdWGAaCbmJHBTifyp5/cioziFsBzRUCgYB7XTLB41fpS8tTXgd9CIThR+6Hh6SIfgUxdLC9OUzX2B7QWXL0pjtZsrHYF52pb9ap+UbRIpEQyqHgL4PNcH3p15UEjrCplC3Wu6v5pJl9AW7RWo2W9oPN/EVPg7Bsn3XNWo8KlvfQOSG93ieejOkJ7IO/hKa/UFnmREgF+bqwoQKBgQCc16QZsxFofT5+8wMXc7bmTsegtlp7o0VshmxBnMB/ULqF1VGNZDqM3T5V/NpoUeZsXUEHAziqL4VvRBR1R0WWjNMnyR/LojWpuvILIhVV0+06LJAxD8PMJKZyxAcN3Zr9hYxfVsQOHerpi/dUTNmYG0FAQpEYVeNFpKN2fc9JUQKBgQCNJ+Grt6eavrQh4cGaa/FeGF02CsP4PE1C96WfExJSvlygWqtKR2eBHXv+mnqsJbIK31lkObcVWFzX7mgiD1pHMeshpjIXhUpnox+kjW+ishb21/xsXgjoXh7UcdtnKm9VHeINVdIq4pRh6TVhX43WLOD/zXR2qa57WiZT//xHTA==";

    // notify_url 交易过程中服务器通知的页面 要用 http://格式的完整路径，不允许加?id=123这类自定义参数
    public static String notify_url = "http://127.0.0.1:8082/notifyN";

    public static String return_url = "http://127.0.0.1:8082/returnN";


    //请求网关地址
    public static String URL = "https://openapi.alipaydev.com/gateway.do";


    //编码格式
    public static String CHARSET = "UTF-8"; // 页面编码

    //返回格式
    public static String FORMAT = "json";

    //支付宝公钥
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApztZCqhD9A4T864C9oS58ivAjL4nmxryfnFvdLrZE6UVtzRRIcCCrD8Pk7Fog08YMS3VNrYzYOIz6LGlWRQGxFzbntokJMV6RmcErrWz/FUhH634MMMl5/PYY38MGzX7shW8Te/xrErPyE/zquVE6ZKrxEon1Y9arFRTQbP6gQ7QgIDmnZ8arWnThXYPr8GmhD7K3lLVPBLLZmKi3bQbiePNCQJuOY3d34LW6UmV2c9Jxf4G7cHCreFEgANBPw88RhQlTjW7rHvR7OPf+FxPI6gNc3lcxNGYg4s7wZlbYi9d7Uq6L2Whp/+t7LgiVW4Kua1wlrzrV/naXN9t46fWnQIDAQAB";


    // 加密方式 不需修改
    public static String SIGNTYPE = "RSA2";


}

