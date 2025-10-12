import pino from "pino";

const isProd = process.env.NODE_ENV === 'production';

const logger = pino({
    level: isProd ? 'info' : 'debug',
});

export default logger;