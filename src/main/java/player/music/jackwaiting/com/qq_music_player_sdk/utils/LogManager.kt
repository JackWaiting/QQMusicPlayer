package player.music.jackwaiting.com.qq_music_player_sdk.utils

import android.util.Log
import kotlin.experimental.and

/**
 * Created by JackWaiting on 2018/10/30.
 */
/**
 *
 *
 * **A simple wrapper class of [Log],which supplies
 * more useful information and is easier to use than [Log]
 * .**
 *
 *
 * @author JackWaiting
 *
 * @since 0.0.1
 */
object LogManager {
    /**
     * The debug tag for you to show the log or not.You must modify the tag
     * manually!
     *
     * @since 0.0.1
     */
    var DEBUG = true

    /**
     * The default tag for the log.
     *
     * @since 0.0.1
     */
    /**
     * Get the default tag.
     *
     * @return The default tag.
     *
     * @since 0.0.1
     */
    /**
     * Set the default tag for the global environment.
     *
     * @param tagDefault
     * The default tag you want to set,no matter null or empty.
     *
     * @since 0.0.1
     */
    var tagDefault = LogManager::class.java.simpleName
        set(tagDefault) {
            field = dealWithString(tagDefault)
        }

    /**
     * It's the same as you use [Log.v],the
     * tag is [LogManager.sTagDefault].
     *
     * @param message
     * The message you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun v(message: String) {
        if (DEBUG) {
            log(Level.V, tagDefault, buildMessage(message).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * It's the same as you use [Log.v].
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param message
     * The message you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun v(tag: String, message: String) {
        if (DEBUG) {
            log(Level.V, tag, buildMessage(message).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * It's the same as you use
     * [Log.v].
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param message
     * The message you want to log,no matter it's null or empty.
     * @param throwable
     * [Throwable] .
     *
     * @since 0.0.1
     */
    fun v(tag: String, message: String, throwable: Throwable) {
        if (DEBUG) {
            log(Level.V, tag, buildMessage(message).toString().trim { it <= ' ' },
                    throwable)
        }
    }

    /**
     * It's the same as you use [Log.d],the
     * tag is [LogManager.sTagDefault].
     *
     * @param message
     * The message you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun d(message: String) {
        if (DEBUG) {
            log(Level.D, tagDefault, buildMessage(message).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * It's the same as you use [Log.d].
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param message
     * The message you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun d(tag: String, message: String) {
        if (DEBUG) {
            log(Level.D, tag, buildMessage(message).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * It's the same as you use
     * [Log.d].
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param message
     * The message you want to log,no matter it's null or empty.
     * @param throwable
     * [Throwable] .
     *
     * @since 0.0.1
     */
    fun d(tag: String, message: String, throwable: Throwable) {
        if (DEBUG) {
            log(Level.D, tag, buildMessage(message).toString().trim { it <= ' ' },
                    throwable)
        }
    }

    /**
     * It's the same as you use [Log.i],the
     * tag is [LogManager.sTagDefault].
     *
     * @param message
     * The message you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun i(message: String) {
        if (DEBUG) {
            log(Level.I, tagDefault, buildMessage(message).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * It's the same as you use [Log.i].
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param message
     * The message you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun i(tag: String, message: String) {
        if (DEBUG) {
            log(Level.I, tag, buildMessage(message).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * It's the same as you use
     * [Log.i].
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param message
     * The message you want to log,no matter it's null or empty.
     * @param throwable
     * [Throwable] .
     *
     * @since 0.0.1
     */
    fun i(tag: String, message: String, throwable: Throwable) {
        if (DEBUG) {
            log(Level.I, tag, buildMessage(message).toString().trim { it <= ' ' },
                    throwable)
        }
    }

    /**
     * It's the same as you use [Log.i],the
     * tag is [LogManager.sTagDefault].
     *
     * @param message
     * The message you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun w(message: String) {
        if (DEBUG) {
            log(Level.W, tagDefault, buildMessage(message).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * It's the same as you use [Log.w].
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param message
     * The message you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun w(tag: String, message: String) {
        if (DEBUG) {
            log(Level.W, tag, buildMessage(message).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * It's the same as you use
     * [Log.w].
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param message
     * The message you want to log,no matter it's null or empty.
     * @param throwable
     * [Throwable] .
     *
     * @since 0.0.1
     */
    fun w(tag: String, message: String, throwable: Throwable) {
        if (DEBUG) {
            log(Level.W, tag, buildMessage(message).toString().trim { it <= ' ' },
                    throwable)
        }
    }

    /**
     * It's the same as you use [Log.e],the
     * tag is [LogManager.sTagDefault].
     *
     * @param message
     * The message you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun e(message: String) {
        if (DEBUG) {
            log(Level.E, tagDefault, buildMessage(message).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * It's the same as you use [Log.e].
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param message
     * The message you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun e(tag: String, message: String) {
        if (DEBUG) {
            log(Level.E, tag, buildMessage(message).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * It's the same as you use
     * [Log.e].
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param message
     * The message you want to log,no matter it's null or empty.
     * @param throwable
     * [Throwable] .
     *
     * @since 0.0.1
     */
    fun e(tag: String, message: String, throwable: Throwable) {
        if (DEBUG) {
            log(Level.E, tag, buildMessage(message).toString().trim { it <= ' ' },
                    throwable)
        }
    }

    /**
     * It's the same as you use [Log.wtf],the
     * tag is [LogManager.sTagDefault].
     *
     * @param message
     * The message you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun wtf(message: String) {
        if (DEBUG) {
            log(Level.WTF, tagDefault,
                    buildMessage(message).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * It's the same as you use [Log.wtf].
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param message
     * The message you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun wtf(tag: String, message: String) {
        if (DEBUG) {
            log(Level.WTF, tag, buildMessage(message).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * It's the same as you use
     * [Log.wtf].
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param message
     * The message you want to log,no matter it's null or empty.
     * @param throwable
     * [Throwable] .
     *
     * @since 0.0.1
     */
    fun wtf(tag: String, message: String, throwable: Throwable) {
        if (DEBUG) {
            log(Level.WTF, tag, buildMessage(message).toString().trim { it <= ' ' },
                    throwable)
        }
    }

    /**
     * Log the objects with the level V.
     *
     * @param objects
     * The objects you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun verbose(vararg objects: Any) {
        if (DEBUG) {
            log(Level.V, tagDefault, buildMessage(*objects).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * Log the objects with the level V.
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param objects
     * The objects you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun verbose(tag: String, vararg objects: Any) {
        if (DEBUG) {
            log(Level.V, tag, buildMessage(*objects).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * Log the objects with the level D.
     *
     * @param objects
     * The objects you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun debug(vararg objects: Any) {
        if (DEBUG) {
            log(Level.D, tagDefault, buildMessage(*objects).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * Log the objects with the level D.
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param objects
     * The objects you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun debug(tag: String, vararg objects: Any) {
        if (DEBUG) {
            log(Level.D, tag, buildMessage(*objects).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * Log the objects with the level I.
     *
     * @param objects
     * The objects you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun info(vararg objects: Any) {
        if (DEBUG) {
            log(Level.I, tagDefault, buildMessage(*objects).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * Log the objects with the level I.
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param objects
     * The objects you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun info(tag: String, vararg objects: Any) {
        if (DEBUG) {
            log(Level.I, tagDefault, buildMessage(*objects).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * Log the objects with the level W.
     *
     * @param objects
     * The objects you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun warn(vararg objects: Any) {
        if (DEBUG) {
            log(Level.W, tagDefault, buildMessage(*objects).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * Log the objects with the level W.
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param objects
     * The objects you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun warn(tag: String, vararg objects: Any) {
        if (DEBUG) {
            log(Level.W, tag, buildMessage(*objects).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * Log the objects with the level E.
     *
     * @param objects
     * The objects you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun error(vararg objects: Any) {
        if (DEBUG) {
            log(Level.E, tagDefault, buildMessage(*objects).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * Log the objects with the level E.
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param objects
     * The objects you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun error(tag: String, vararg objects: Any) {
        if (DEBUG) {
            log(Level.E, tag, buildMessage(*objects).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * Log the objects with the level WTF.
     *
     * @param objects
     * The objects you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun wtf(vararg objects: Any) {
        if (DEBUG) {
            log(Level.WTF, tagDefault,
                    buildMessage(*objects).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * Log the objects with the level WTF.
     *
     * @param tag
     * The tag you want to set,no matter it's null or empty.
     * @param objects
     * The objects you want to log,no matter it's null or empty.
     *
     * @since 0.0.1
     */
    fun wtf(tag: String, vararg objects: Any) {
        if (DEBUG) {
            log(Level.WTF, tag, buildMessage(*objects).toString().trim { it <= ' ' }, null)
        }
    }

    /**
     * Build the more useful message.
     *
     * @param objects
     * The objects you want to log.
     * @return The more useful message.
     */
    private fun buildMessage(vararg objects: Any): StringBuffer {
        val message = StringBuffer()

        message.append("****************************************************")
                .append("\n")

        message.append(buildStackTraceInformation(Throwable()
                .stackTrace))

        if (objects != null && objects.size > 0) {
            for (i in objects.indices) {
                if (objects[i] != null) {
                    if (objects[i] is BooleanArray) {
                        val objecters = objects[i] as BooleanArray
                        message.append("{")

                        for (j in objecters.indices) {
                            message.append(objecters[j])

                            if (j != objecters.size - 1) {
                                message.append(" ")
                            }
                        }

                        message.append("}")
                    } else if (objects[i] is CharArray) {
                        val objecters = objects[i] as CharArray
                        message.append("{")

                        for (j in objecters.indices) {
                            message.append(objecters[j])

                            if (j != objecters.size - 1) {
                                message.append(" ")
                            }
                        }

                        message.append("}")
                    } else if (objects[i] is ByteArray) {
                        val objecters = objects[i] as ByteArray
                        message.append("{")

                        for (j in objecters.indices) {
                            message.append(Integer.toHexString((objecters[j] and 0xFF.toByte()).toInt()))

                            if (j != objecters.size - 1) {
                                message.append(" ")
                            }
                        }

                        message.append("}")
                    } else if (objects[i] is ShortArray) {
                        val objecters = objects[i] as ShortArray
                        message.append("{")

                        for (j in objecters.indices) {
                            message.append(objecters[j].toInt())

                            if (j != objecters.size - 1) {
                                message.append(" ")
                            }
                        }

                        message.append("}")
                    } else if (objects[i] is IntArray) {
                        val objecters = objects[i] as IntArray
                        message.append("{")

                        for (j in objecters.indices) {
                            message.append(objecters[j])

                            if (j != objecters.size - 1) {
                                message.append(" ")
                            }
                        }

                        message.append("}")
                    } else if (objects[i] is LongArray) {
                        val objecters = objects[i] as LongArray
                        message.append("{")

                        for (j in objecters.indices) {
                            message.append(objecters[j])

                            if (j != objecters.size - 1) {
                                message.append(" ")
                            }
                        }

                        message.append("}")
                    } else if (objects[i] is FloatArray) {
                        val objecters = objects[i] as FloatArray
                        message.append("{")

                        for (j in objecters.indices) {
                            message.append(objecters[j])

                            if (j != objecters.size - 1) {
                                message.append(" ")
                            }
                        }

                        message.append("}")
                    } else if (objects[i] is DoubleArray) {
                        val objecters = objects[i] as DoubleArray
                        message.append("{")

                        for (j in objecters.indices) {
                            message.append(objecters[j])

                            if (j != objecters.size - 1) {
                                message.append(" ")
                            }
                        }

                        message.append("}")
                    } else if (objects[i] is Array<*>) {
                        val objecters = objects[i] as Array<Any>
                        message.append("{")

                        for (j in objecters.indices) {
                            message.append(if (objecters[j] != null)
                                objecters[j]
                            else
                                "null")

                            if (j != objecters.size - 1) {
                                message.append(" ")
                            }
                        }

                        message.append("}")
                    } else if (objects[i] is Set<*>) {
                        val sets = objects[i] as Set<*>
                        val iterator = sets.iterator()
                        var counter = 0

                        message.append("{")
                        while (iterator.hasNext()) {
                            counter++

                            val objecter = iterator.next()

                            message.append(objecter ?: "null")

                            if (counter != sets.size) {
                                message.append(" ")
                            }
                        }

                        message.append("}")
                    } else if (objects[i] is List<*>) {
                        val list = objects[i] as List<*>

                        message.append("{")
                        for (j in list.indices) {
                            message.append(if (list[j] != null)
                                list[j]
                                        .toString()
                            else
                                "null")

                            if (j != list.size - 1) {
                                message.append(" ")
                            }
                        }

                        message.append("}")
                    } else {
                        message.append(objects[i].toString())
                    }

                } else {
                    message.append("null")
                }

                if (i != objects.size - 1) {
                    message.append(" ")
                }
            }
        } else {
            message.append("The log message is empty!")
        }

        message.append("\n").append(
                "****************************************************")

        return message
    }

    /**
     * The log level enumeration.
     *
     * @author ifeegoo
     *
     * @since 0.0.1
     */
    private enum class Level {
        V, D, I, W, E, WTF
    }

    /**
     * Log the message.
     *
     * @param level
     * The log level.
     * @param tag
     * The log tag.
     * @param message
     * The log message.
     * @param throwable
     * [Throwable];
     *
     * @since 0.0.1
     */
    private fun log(level: Level, tag: String, message: String,
                    throwable: Throwable?) {
        when (level) {
            LogManager.Level.V -> {
                Log.v(dealWithString(tag), dealWithString(message), throwable)
            }
            LogManager.Level.D -> {
                Log.d(dealWithString(tag), dealWithString(message), throwable)
            }
            LogManager.Level.I -> {
                Log.i(dealWithString(tag), dealWithString(message), throwable)
            }
            LogManager.Level.E -> {
                Log.e(dealWithString(tag), dealWithString(message), throwable)
            }
            LogManager.Level.W -> {

                Log.w(dealWithString(tag), dealWithString(message), throwable)
            }
            LogManager.Level.WTF -> {
                Log.wtf(dealWithString(tag), dealWithString(message), throwable)
            }
            else -> {
            }
        }
    }

    /**
     * Deal with the situation null or empty.
     *
     * @param string
     * String you want to deal with.
     * @return The String
     *
     * @since 0.0.1
     */
    private fun dealWithString(string: String?): String {
        var string = string
        if (string == null) {
            string = "null"
        } else if (string === "") {
            string = "empty"
        }

        return string
    }

    /**
     * Build the stack trace information.
     *
     * @param stackTraceElements
     * Stack trace elements.
     * @return The stack trace information.
     *
     * @since 0.0.1
     */
    private fun buildStackTraceInformation(
            stackTraceElements: Array<StackTraceElement>): String {
        val stackTraceInformation = StringBuffer()

        val fileName = stackTraceElements[2].fileName
        val className = stackTraceElements[2].className
        val methodName = stackTraceElements[2].methodName
        val lineNumber = stackTraceElements[2].lineNumber

        stackTraceInformation.append("[").append(fileName).append("]")
                .append("[").append(className).append("]").append("[")
                .append(methodName).append("]").append("[").append(lineNumber)
                .append("]").append("\n")

        return stackTraceInformation.toString()
    }

}