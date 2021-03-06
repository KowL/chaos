package org.chaos.dubbo.common.constants;

import org.chaos.dubbo.common.URL;

import java.net.NetworkInterface;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

public interface CommonConstants {
    String DUBBO = "dubbo";

    String PROVIDER = "provider";

    String CONSUMER = "consumer";

    String APPLICATION_KEY = "application";

    String REMOTE_APPLICATION_KEY = "remote.application";

    String ENABLED_KEY = "enabled";

    String DISABLED_KEY = "disabled";

    String DUBBO_PROPERTIES_KEY = "dubbo.properties.file";

    String DEFAULT_DUBBO_PROPERTIES = "dubbo.properties";

    String ANY_VALUE = "*";

    String COMMA_SEPARATOR = ",";

    String DOT_SEPARATOR = ".";

    Pattern COMMA_SPLIT_PATTERN = Pattern.compile("\\s*[,]+\\s*");

    String PATH_SEPARATOR = "/";

    String PROTOCOL_SEPARATOR = "://";

    String PROTOCOL_SEPARATOR_ENCODED = URL.encode(PROTOCOL_SEPARATOR);

    String REGISTRY_SEPARATOR = "|";

    Pattern REGISTRY_SPLIT_PATTERN = Pattern.compile("\\s*[|;]+\\s*");

    Pattern D_REGISTRY_SPLIT_PATTERN = Pattern.compile("\\s*[|]+\\s*");

    String SEMICOLON_SEPARATOR = ";";

    Pattern SEMICOLON_SPLIT_PATTERN = Pattern.compile("\\s*[;]+\\s*");

    Pattern EQUAL_SPLIT_PATTERN = Pattern.compile("\\s*[=]+\\s*");

    String DEFAULT_PROXY = "javassist";

    String DEFAULT_DIRECTORY = "dubbo";

    String PROTOCOL_KEY = "protocol";

    String DEFAULT_PROTOCOL = "dubbo";

    String DEFAULT_THREAD_NAME = "Dubbo";

    int DEFAULT_CORE_THREADS = 0;

    int DEFAULT_THREADS = 200;

    String EXECUTOR_SERVICE_COMPONENT_KEY = ExecutorService.class.getName();

    String THREADPOOL_KEY = "threadpool";

    String THREAD_NAME_KEY = "threadname";

    String CORE_THREADS_KEY = "corethreads";

    String THREADS_KEY = "threads";

    String QUEUES_KEY = "queues";

    String ALIVE_KEY = "alive";

    String DEFAULT_THREADPOOL = "limited";

    String DEFAULT_CLIENT_THREADPOOL = "cached";

    String IO_THREADS_KEY = "iothreads";

    int DEFAULT_QUEUES = 0;

    int DEFAULT_ALIVE = 60 * 1000;

    String TIMEOUT_KEY = "timeout";

    int DEFAULT_TIMEOUT = 1000;

    // used by invocation attachments to transfer timeout from Consumer to Provider.
    // works as a replacement of TIMEOUT_KEY on wire, which seems to be totally useless in previous releases).
    String TIMEOUT_ATTACHENT_KEY = "_TO";

    String TIME_COUNTDOWN_KEY = "timeout-countdown";

    String ENABLE_TIMEOUT_COUNTDOWN_KEY = "enable-timeout-countdown";

    String REMOVE_VALUE_PREFIX = "-";

    String PROPERTIES_CHAR_SEPERATOR = "-";

    String UNDERLINE_SEPARATOR = "_";

    String SEPARATOR_REGEX = "_|-";

    String GROUP_CHAR_SEPERATOR = ":";

    String HIDE_KEY_PREFIX = ".";

    String DOT_REGEX = "\\.";

    String DEFAULT_KEY_PREFIX = "default.";

    String DEFAULT_KEY = "default";

    String PREFERRED_KEY = "preferred";

    /**
     * Default timeout value in milliseconds for server shutdown
     */
    int DEFAULT_SERVER_SHUTDOWN_TIMEOUT = 10000;

    String SIDE_KEY = "side";

    String PROVIDER_SIDE = "provider";

    String CONSUMER_SIDE = "consumer";

    String ANYHOST_KEY = "anyhost";

    String ANYHOST_VALUE = "0.0.0.0";

    String LOCALHOST_KEY = "localhost";

    String LOCALHOST_VALUE = "127.0.0.1";

    String METHODS_KEY = "methods";

    String METHOD_KEY = "method";

    String PID_KEY = "pid";

    String TIMESTAMP_KEY = "timestamp";

    String GROUP_KEY = "group";

    String PATH_KEY = "path";

    String INTERFACE_KEY = "interface";

    String FILE_KEY = "file";

    String DUMP_DIRECTORY = "dump.directory";

    String CLASSIFIER_KEY = "classifier";

    String VERSION_KEY = "version";

    String REVISION_KEY = "revision";

    String METADATA_KEY = "metadata-type";

    String DEFAULT_METADATA_STORAGE_TYPE = "local";

    String REMOTE_METADATA_STORAGE_TYPE = "remote";

    /**
     * Consumer side 's proxy class
     */
    String PROXY_CLASS_REF = "refClass";

    /**
     * generic call
     */
    String $INVOKE = "$invoke";
    String $INVOKE_ASYNC = "$invokeAsync";

    /**
     * package version in the manifest
     */
    String RELEASE_KEY = "release";

    int MAX_PROXY_COUNT = 65535;

    String MONITOR_KEY = "monitor";
    String CLUSTER_KEY = "cluster";
    String USERNAME_KEY = "username";
    String PASSWORD_KEY = "password";
    String HOST_KEY = "host";
    String PORT_KEY = "port";
    String DUBBO_IP_TO_BIND = "DUBBO_IP_TO_BIND";

    /**
     * The property name for {@link NetworkInterface#getDisplayName() the name of network interface} that
     * the Dubbo application prefers
     *
     * @since 2.7.6
     */
    String DUBBO_PREFERRED_NETWORK_INTERFACE = "dubbo.network.interface.preferred";

    @Deprecated
    String SHUTDOWN_WAIT_SECONDS_KEY = "dubbo.service.shutdown.wait.seconds";
    String SHUTDOWN_WAIT_KEY = "dubbo.service.shutdown.wait";
    String DUBBO_PROTOCOL = "dubbo";

    String DUBBO_LABELS = "dubbo.labels";
    String DUBBO_ENV_KEYS = "dubbo.env.keys";

    String CONFIG_CONFIGFILE_KEY = "config-file";
    String CONFIG_ENABLE_KEY = "highest-priority";
    String CONFIG_NAMESPACE_KEY = "namespace";
    String CHECK_KEY = "check";

    String BACKLOG_KEY = "backlog";

    String HEARTBEAT_EVENT = null;
    String MOCK_HEARTBEAT_EVENT = "H";
    String READONLY_EVENT = "R";

    String REFERENCE_FILTER_KEY = "reference.filter";

    String INVOKER_LISTENER_KEY = "invoker.listener";

    String DUBBO_VERSION_KEY = "dubbo";

    String TAG_KEY = "dubbo.tag";

    /**
     * To decide whether to make connection when the client is created
     */
    String LAZY_CONNECT_KEY = "lazy";

    String STUB_EVENT_KEY = "dubbo.stub.event";

    String REFERENCE_INTERCEPTOR_KEY = "reference.interceptor";

    String SERVICE_FILTER_KEY = "service.filter";

    String EXPORTER_LISTENER_KEY = "exporter.listener";

    String METRICS_PORT = "metrics.port";

    String METRICS_PROTOCOL = "metrics.protocol";

    /**
     * After simplify the registry, should add some parameter individually for provider.
     *
     * @since 2.7.0
     */
    String EXTRA_KEYS_KEY = "extra-keys";

    String GENERIC_SERIALIZATION_NATIVE_JAVA = "nativejava";

    String GENERIC_SERIALIZATION_DEFAULT = "true";

    String GENERIC_SERIALIZATION_BEAN = "bean";

    String GENERIC_RAW_RETURN = "raw.return";

    String GENERIC_SERIALIZATION_PROTOBUF = "protobuf-json";

    String GENERIC_WITH_CLZ_KEY = "generic.include.class";

    /**
     * The limit of callback service instances for one interface on every client
     */
    String CALLBACK_INSTANCES_LIMIT_KEY = "callbacks";

    /**
     * The default limit number for callback service instances
     *
     * @see #CALLBACK_INSTANCES_LIMIT_KEY
     */
    int DEFAULT_CALLBACK_INSTANCES = 1;

    String LOADBALANCE_KEY = "loadbalance";

    String DEFAULT_LOADBALANCE = "random";

    String RETRIES_KEY = "retries";

    String FORKS_KEY = "forks";

    int DEFAULT_RETRIES = 2;

    int DEFAULT_FAILBACK_TIMES = 3;

    String REGISTER_KEY = "register";

    String INTERFACES = "interfaces";

    String SSL_ENABLED_KEY = "ssl-enabled";

}
