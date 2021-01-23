package projects.dpi.serialized;

public class DNSSchema {
    public static final String DPI_DNS_SCHEMA_ZZ = "{\n" +
            "    \"namespace\": \"dnsavro\",\n" +
            "    \"type\": \"record\",\n" +
            "    \"name\": \"DNSLog\",\n" +
            "    \"fields\": [\n" +
            "        {\n" +
            "            \"name\": \"Time\",\n" +
            "            \"type\": [\n" +
            "                \"long\",\n" +
            "                \"null\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"name\": \"ArriveTime\",\n" +
            "            \"type\": [\n" +
            "                \"string\",\n" +
            "                \"null\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"name\": \"SrcIp\",\n" +
            "            \"type\": [\n" +
            "                \"string\",\n" +
            "                \"null\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"name\": \"DstIp\",\n" +
            "            \"type\": [\n" +
            "                \"string\",\n" +
            "                \"null\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"name\": \"SrcPort\",\n" +
            "            \"type\": [\n" +
            "                \"long\",\n" +
            "                \"null\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"name\": \"DstPort\",\n" +
            "            \"type\": [\n" +
            "                \"long\",\n" +
            "                \"null\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"name\": \"PacketCount\",\n" +
            "            \"type\": [\n" +
            "                \"int\",\n" +
            "                \"null\"\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"name\": \"DNSHead\",\n" +
            "            \"type\": {\n" +
            "                \"type\": \"record\",\n" +
            "                \"name\": \"DNSHead\",\n" +
            "                \"fields\": [\n" +
            "                    {\n" +
            "                        \"name\": \"TransactionID\",\n" +
            "                        \"type\": \"int\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"DomainName\",\n" +
            "                        \"type\": [\n" +
            "                            \"string\",\n" +
            "                            \"null\"\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"ZFlag\",\n" +
            "                        \"type\": [\n" +
            "                            \"int\",\n" +
            "                            \"null\"\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"QuestionCount\",\n" +
            "                        \"type\": [\n" +
            "                            \"int\",\n" +
            "                            \"null\"\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"AnswerCount\",\n" +
            "                        \"type\": [\n" +
            "                            \"int\",\n" +
            "                            \"null\"\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"AuthorityCount\",\n" +
            "                        \"type\": [\n" +
            "                            \"int\",\n" +
            "                            \"null\"\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"AdditionalCount\",\n" +
            "                        \"type\": [\n" +
            "                            \"int\",\n" +
            "                            \"null\"\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"QrFlag\",\n" +
            "                        \"type\": [\n" +
            "                            \"boolean\",\n" +
            "                            \"null\"\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"OpCodeFlag\",\n" +
            "                        \"type\": [\n" +
            "                            \"int\",\n" +
            "                            \"null\"\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"AAFlag1\",\n" +
            "                        \"type\": [\n" +
            "                            \"boolean\",\n" +
            "                            \"null\"\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"TCFlag1\",\n" +
            "                        \"type\": [\n" +
            "                            \"boolean\",\n" +
            "                            \"null\"\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"RDFlag1\",\n" +
            "                        \"type\": [\n" +
            "                            \"boolean\",\n" +
            "                            \"null\"\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"RAFlag1\",\n" +
            "                        \"type\": [\n" +
            "                            \"boolean\",\n" +
            "                            \"null\"\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"name\": \"RCode1\",\n" +
            "                        \"type\": [\n" +
            "                            \"int\",\n" +
            "                            \"null\"\n" +
            "                        ]\n" +
            "                    }\n" +
            "                ]\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"name\": \"DNSRequest\",\n" +
            "            \"type\": {\n" +
            "                \"type\": \"array\",\n" +
            "                \"items\": [\n" +
            "                    \"null\",\n" +
            "                    {\n" +
            "                        \"type\": \"record\",\n" +
            "                        \"name\": \"DNSRequest\",\n" +
            "                        \"fields\": [\n" +
            "                            {\n" +
            "                                \"name\": \"Name\",\n" +
            "                                \"type\": \"string\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"Type\",\n" +
            "                                \"type\": \"int\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"DnsClass\",\n" +
            "                                \"type\": \"int\"\n" +
            "                            }\n" +
            "                        ]\n" +
            "                    }\n" +
            "                ]\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"name\": \"DNSResponses\",\n" +
            "            \"type\": {\n" +
            "                \"type\": \"array\",\n" +
            "                \"items\": [\n" +
            "                    \"null\",\n" +
            "                    {\n" +
            "                        \"type\": \"record\",\n" +
            "                        \"name\": \"DNSResponses\",\n" +
            "                        \"fields\": [\n" +
            "                            {\n" +
            "                                \"name\": \"Name\",\n" +
            "                                \"type\": \"string\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"Type\",\n" +
            "                                \"type\": \"int\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"DnsClass\",\n" +
            "                                \"type\": \"int\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"TimeToLive\",\n" +
            "                                \"type\": \"int\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"DataLength\",\n" +
            "                                \"type\": \"int\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"NameOrAddress\",\n" +
            "                                \"type\": \"string\"\n" +
            "                            }\n" +
            "                        ]\n" +
            "                    }\n" +
            "                ]\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"name\": \"AuthNameServers\",\n" +
            "            \"type\": {\n" +
            "                \"type\": \"array\",\n" +
            "                \"items\": [\n" +
            "                    \"null\",\n" +
            "                    {\n" +
            "                        \"type\": \"record\",\n" +
            "                        \"name\": \"AuthNameServers\",\n" +
            "                        \"fields\": [\n" +
            "                            {\n" +
            "                                \"name\": \"Name\",\n" +
            "                                \"type\": [\n" +
            "                                    \"string\",\n" +
            "                                    \"null\"\n" +
            "                                ]\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"Type\",\n" +
            "                                \"type\": [\n" +
            "                                    \"int\",\n" +
            "                                    \"null\"\n" +
            "                                ]\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"DnsClass\",\n" +
            "                                \"type\": [\n" +
            "                                    \"int\",\n" +
            "                                    \"null\"\n" +
            "                                ]\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"TimeToLive\",\n" +
            "                                \"type\": [\n" +
            "                                    \"int\",\n" +
            "                                    \"null\"\n" +
            "                                ]\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"DataLength\",\n" +
            "                                \"type\": [\n" +
            "                                    \"int\",\n" +
            "                                    \"null\"\n" +
            "                                ]\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"NameOrAddress\",\n" +
            "                                \"type\": [\n" +
            "                                    \"string\",\n" +
            "                                    \"null\"\n" +
            "                                ]\n" +
            "                            }\n" +
            "                        ]\n" +
            "                    }\n" +
            "                ]\n" +
            "            }\n" +
            "        },\n" +
            "        {\n" +
            "            \"name\": \"additionalRecords\",\n" +
            "            \"type\": {\n" +
            "                \"type\": \"array\",\n" +
            "                \"items\": [\n" +
            "                    \"null\",\n" +
            "                    {\n" +
            "                        \"type\": \"record\",\n" +
            "                        \"name\": \"additionalRecords\",\n" +
            "                        \"fields\": [\n" +
            "                            {\n" +
            "                                \"name\": \"Name\",\n" +
            "                                \"type\": [\n" +
            "                                    \"string\",\n" +
            "                                    \"null\"\n" +
            "                                ]\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"Type\",\n" +
            "                                \"type\": [\n" +
            "                                    \"int\",\n" +
            "                                    \"null\"\n" +
            "                                ]\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"DnsClass\",\n" +
            "                                \"type\": [\n" +
            "                                    \"int\",\n" +
            "                                    \"null\"\n" +
            "                                ]\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"TimeToLive\",\n" +
            "                                \"type\": [\n" +
            "                                    \"int\",\n" +
            "                                    \"null\"\n" +
            "                                ]\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"DataLength\",\n" +
            "                                \"type\": [\n" +
            "                                    \"int\",\n" +
            "                                    \"null\"\n" +
            "                                ]\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"name\": \"NameOrAddress\",\n" +
            "                                \"type\": [\n" +
            "                                    \"string\",\n" +
            "                                    \"null\"\n" +
            "                                ]\n" +
            "                            }\n" +
            "                        ]\n" +
            "                    }\n" +
            "                ]\n" +
            "            }\n" +
            "        }\n" +
            "    ]\n" +
            "}";
}
