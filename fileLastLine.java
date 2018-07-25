public Integer fileLastLine(Path path) {
        int lineCount = 1;
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toString()))) {
            for (String line; (line = reader.readLine()) != null; ++lineCount) {
            }
        } catch (IOException e) {
            logger.error(e);
        }
        return lineCount;
    }
