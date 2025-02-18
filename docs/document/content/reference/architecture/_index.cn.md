+++
pre = "<b>7.13. </b>"
title = "基础架构"
weight = 13
+++

让开发者能够像使用积木一样定制属于自己的独特系统，是 Apache ShardingSphere 可插拔架构的设计目标。

可插拔架构对程序架构设计的要求非常高，需要将各个模块相互独立，互不感知，并且通过一个可插拔内核，以叠加的方式将各种功能组合使用。 设计一套将功能开发完全隔离的架构体系，既可以最大限度的将开源社区的活力激发出来，也能够保障项目的质量。

Apache ShardingSphere 5.x 版本开始致力于可插拔架构，项目的功能组件能够灵活的以可插拔的方式进行扩展。 目前，数据分片、读写分离、数据库高可用、数据加密、影子库压测等功能，以及对 MySQL、PostgreSQL、SQLServer、Oracle 等 SQL 与协议的支持，均通过插件的方式织入项目。 Apache ShardingSphere 目前已提供数十个  [SPI（Service Provider Interface）](https://docs.oracle.com/javase/tutorial/sound/SPI-intro.html) 作为系统的扩展点，而且仍在不断增加中。

![ShardingSphere Architecture](https://shardingsphere.apache.org/document/current/img/pluggable_platform.png)
