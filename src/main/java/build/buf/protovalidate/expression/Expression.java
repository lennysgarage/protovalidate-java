// Copyright 2023 Buf Technologies, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package build.buf.protovalidate.expression;

import build.buf.gen.buf.validate.priv.Constraint;
import java.util.ArrayList;
import java.util.List;

/** Expression represents a single CEL expression. */
public class Expression {
  public final String id;
  public final String message;
  public final String expression;

  private Expression(String id, String message, String expression) {
    this.id = id;
    this.message = message;
    this.expression = expression;
  }

  private Expression(build.buf.gen.buf.validate.Constraint constraint) {
    this(constraint.getId(), constraint.getMessage(), constraint.getExpression());
  }

  private Expression(build.buf.gen.buf.validate.priv.Constraint constraint) {
    this(constraint.getId(), constraint.getMessage(), constraint.getExpression());
  }

  /** Constructs a new {@link Expression} from the given private constraint. */
  public static List<Expression> fromPrivConstraints(
      List<build.buf.gen.buf.validate.priv.Constraint> constraints) {
    List<Expression> expressions = new ArrayList<>();
    for (Constraint constraint : constraints) {
      expressions.add(new Expression(constraint));
    }
    return expressions;
  }

  /** Constructs a new {@link Expression} from the given constraint. */
  public static List<Expression> fromConstraints(
      List<build.buf.gen.buf.validate.Constraint> constraints) {
    List<Expression> expressions = new ArrayList<>();
    for (build.buf.gen.buf.validate.Constraint constraint : constraints) {
      expressions.add(new Expression(constraint));
    }
    return expressions;
  }
}
